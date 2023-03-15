package binaryTree;

import java.util.Scanner;

public class BinaryTree {

    Scanner scanner = new Scanner(System.in);
    public Node create() {
        int x;
        Node newNode = new Node();
        System.out.println("Enter the data part");
        x = scanner.nextInt();
        if(x == -1) {
            return null;
        }
        newNode.data = x;
        System.out.println("Enter the left child");
        x = scanner.nextInt();
        newNode.left = create();
        System.out.println("Enter the right child");
        x = scanner.nextInt();
        newNode.right = create();
        return newNode;
    }
}
