package udp.v1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.*;

public class Server2 {
    public static void main(String[] args) throws IOException {
        // 1. 创建 Server 的 Socket
        //    内部会进行本地 ip + port 的绑定
        //    例子：饭店开张，提供一个大家都认识的地段 ip + port
        //    ip 虽然没传，内部会帮我们处理，把所有的 ip 都会绑定
        try (DatagramSocket socket = new DatagramSocket(9939)) {

            // 2. 开门迎客，通过循环，处理业务
            while (true) {
                // 3. 处理一个要求
                action(socket);
            }
        }
    }

    /**
     * 处理要求
     * @param socket
     */
    private static void action(DatagramSocket socket) throws IOException {
        // 1. 读取客户端发来的请求

        // 1.1 准备一个字节数组，用来一会存放要读到的数据
        byte[] receiveBuffer = new byte[8192];
        // 1.2 把 buffer 封装成 datagram
        DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, 0, 8192);
        // 1.3 读取请求               2020-04-18 开始准备接收
        socket.receive(receivePacket);
        //                            4040-04-18 成功接收
        // 1.4 从 receive 中返回，就意味着，有人给我发送请求了

        /*
        System.out.println(
                Arrays.toString(
                        Arrays.copyOfRange(receiveBuffer, 0, receivePacket.getLength())
                )
        );
        */
        // 需要将 byte[] 中的数据进行 字符集解码 -> String
        String request = new String(receiveBuffer, 0, receivePacket.getLength(), "UTF-8");
        System.out.printf("收到的请求是 |%s|%n", request);

        // 2. 进行服务 —— 根据请求，处理业务，并生成响应
        // Version 1：回显服务 —— echo 服务
        // 你发送什么过来，我发送什么回去
        // String response = request;

        // Version 2：字典查询服务 —— 请求是英文，响应是中文 + 例句
        // String response = translate(request);

        // Version 3：轮盘聊天
        // 给我发送过请求的 ip + port，我会记录下来
        // 再有人发送来新的请求时，随机选择一个 ip + port 发送回去
        // 不保证对方还在线，所以不保证对方能收到

        //randomTalk(request, receivePacket.getAddress(), receivePacket.getPort());

        // 3. 发送响应回去
        /*
        byte[] sendBuffer = response.getBytes("UTF-8");
        DatagramPacket sendPacket = new DatagramPacket(
            sendBuffer, 0, sendBuffer.length,
            receivePacket.getAddress(),
            receivePacket.getPort()
        );
        socket.send(sendPacket);
        */
    }

    private static class Remote {
        private InetAddress address;
        private int port;

        private Remote(InetAddress address, int port) {
            this.address = address;
            this.port = port;
        }
    }

    // 所有曾经给我发消息的客户端信息——远端
    private static List<Remote> remoteList = new ArrayList<>();
    private static Random random = new Random();}

//    private static void randomTalk(String request, InetAddress address, int port) {
//
//        if (remoteList.size() > 0) {
//            // 随机一个 下标，决定，把这个消息发送给它
//            int rIndex = random.nextInt(remoteList.size());
//            Remote remote = remoteList.get(rIndex);
//
//            // 发送消息过去
//            byte[] sendBuffer = request.getBytes("UTF-8");
//            DatagramPacket sendPacket = new DatagramPacket(
//                    sendBuffer, 0, sendBuffer.length,
//                    remote.address,
//                    remote.port
//            );
//            socket.send(sendPacket);
//        }
//
//        // 把自己加入 remoteList
//        remoteList.add(new Remote(address, port));
//    }

    /*
    private static class Result {
        String chinese;
        String sentence;

        // 内部类的方法即使是私有的，外部类也有权限访问
        private Result(String chinese, String sentence) {
            this.chinese = chinese;
            this.sentence = sentence;
        }
    }

    private static Map<String, Result> dictionary = new TreeMap<>();

    // 静态代码块，用于初始化静态属性使用
    static {
        dictionary.put("dictionary", new Result("n. 字典；词典", "He threw my dictionary back. "));
        dictionary.put("mask", new Result("n. 面具；口罩；掩饰", "They contrived a mask against poison gas."));
    }

    private static String translate(String english) {
        // 按最简单的形式实现 —— 提前保存一份字典
        Result result = dictionary.get(english);
        if (result == null) {
            return "不支持的单词。";
        }

        return String.format("%s%n%s%n", result.chinese, result.sentence);
    }
}*/
