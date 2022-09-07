package moldel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerLibrary mlibrary = new ManagerLibrary();
        int option = 0;
        System.out.println("Chao mung ban da den voi thu vien sach:");
        System.out.println("a.Admin");
        System.out.println("b.Nguoi dung");
        String op= sc.nextLine();


        switch (op){
            case "a":{
                do {
                    System.out.println("Chao mung ban da den voi chuc nang admin: ");
                    System.out.println("Vui long chon chuc nang ");
                    System.out.print(
                            " 1.Them sach vao danh sach thu vien\n" +
                                    " 2.Xoa sach khoi danh sach thu vien\n" +
                                    " 3.In sach ra man hinh\n" +
                                    " 4.Quay sang nguoi dung\n ");

                    option = sc.nextInt();
                    sc.nextLine();
                    if (option == 1) {
                        System.out.println("Nhap code id book ");
                        String idbook = sc.nextLine();
                        System.out.println("Nhap namebook: ");
                        String namebook = sc.next();
                        System.out.println("Nhap nameauthor: ");
                        String nameAuthor = sc.next();
                        System.out.println("Nhap ngay xuat ban");
                        String releasDay = sc.next();
                        Book book = new Book(idbook, namebook, nameAuthor, releasDay);
                        mlibrary.addbook(book);
                        System.out.println("Cam on ban da them sach: ");

                    } else if (option == 2) {
                        System.out.println("Nhap id book can xoa ");
                        String idbook = sc.nextLine();
                        System.out.println(mlibrary.deletebook(idbook) ? "success" : "fail");
                    } else if (option == 3) {
                        System.out.println("Danh sach cac book co trong thu vien la: ");
                        mlibrary.displaybook();
                    } else if (option==4) {
                        break;
                    }

                } while (option != 0);

            }
            case "b":{
                do{
                    System.out.println("Chao mung ban da den voi nguoi dung");
                    System.out.println("Vui long chon chuc nang");
                    System.out.println("1.Them sach vao muc yeu thich");
                    System.out.println("2.Xoa sach khoi muc yeu thich");
                    System.out.println("3.Xem muc yeu thich");
                    System.out.println("4.Tim kiem sach o muc yeu thich");
                    System.out.println("5.Xem tat ca cac sach co trong thu vien");
                    System.out.println("6.Thoat ra");
                    option=sc.nextInt();
                    sc.nextLine();
                    if(option==1){
                        System.out.println("Nhap id book de them vao danh sach yeu thich:");
                        String id= sc.nextLine();
                        System.out.println("Danh sach book da duoc them la: ");
                        mlibrary.addlike(id);
                    }else if(option==2){
                        System.out.println("Nhap id book can xoa : ");
                        String namebook= sc.nextLine();
                        System.out.println(mlibrary.deletelikebook(namebook)? "success" : "fail");

                    }else if(option==3){
                        System.out.println("danh sach yeu thich la: ");
                        mlibrary.displaylikebook();

                    }else if(option==4){
                        System.out.println("Nhap thong tin can search: ");
                        String idbook1= sc.nextLine();
                        System.out.println("ket qua search la: ");
                        mlibrary.searchlikebook(idbook1);

                    }else if(option==5){
                        System.out.println("Danh sach cac book co trong thu vien la: ");
                        mlibrary.displaybook();

                    }else if(option==6){
                        break;
                    }

                }while(option!=0);
            }

        }


    }
}
