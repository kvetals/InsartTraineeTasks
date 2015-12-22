package ua.insart.trainee.Task2;

import com.sanny.API;
import com.sanny.Algo;
import com.sanny.Node;

/**
 * Created by Семья on 18.12.2015.
 */
public class Test {
    public static void main(String[] args) {
        Node tree = API.generateTree();
        API.printRightOrder(tree);
        Algo myAlgorytm = new MyAlgo();
        API.checkAlgorithm(tree,myAlgorytm);

    }
}
