import java.util.Scanner;

public class Student extends User {
    @Override
    public void menu() {
        System.out.println("1. 借书");
        System.out.println("2. 还书");
        System.out.println("3. 现有书展示");
    }

    @Override
    public void operation(int select) {
        switch (select) {
            case 1:
                borrowBook();
                break;
            case 2:
                returnBook();
                break;
            case 3:
                listbooks();
                break;
        }
    }

    private void listbooks() {
    }

    private void returnBook() {
    }

    private void borrowBook() {
        System.out.println("请输入书名：");
        Scanner scanner=new Scanner(System.in);
        String title=scanner.nextLine();



    }
}

