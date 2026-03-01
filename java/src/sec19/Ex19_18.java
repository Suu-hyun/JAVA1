package sec19;

import java.io.File;

public class Ex19_18 {
    public static void main(String[] args) {
        // File file = new File("D:\\ssh\\java_workspace\\java\\src\\sec19\\my_file_korean.txt"); // 절대 경로
        // File file = new File("java\\src\\sec19\\my_file_korean.txt"); // 상대 경로
        File file = new File("java\\src\\sec19\\my_file_korean.txt");

        System.out.println(file);

        System.out.println(file.exists()); // 파일 존재 유무 확인
        System.out.println(file.length()); // 파일의 크기
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.getPath()); // 상대 경로
        System.out.println(file.getAbsolutePath()); // 절대 경로
        System.out.println(file.getParent()); // 폴더 경로
        System.out.println(file.getName()); // 파일명

    }
}
