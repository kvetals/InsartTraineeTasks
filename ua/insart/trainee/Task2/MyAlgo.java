package ua.insart.trainee.Task2;

import com.sanny.Algo;
import com.sanny.Node;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Семья on 18.12.2015.
 */
public class MyAlgo extends Algo {

    @Override
    public Collection execute(Node tree) {
        ArrayList<Integer> listOfNodes = new ArrayList<Integer>();
        getNodeList(tree, listOfNodes);
        System.out.println("myAlgo results are: " + listOfNodes);
        return listOfNodes;
    }
    void getNodeList(Node node, Collection<Integer> list){
        List<Node> children;
        list.add(node.getValue());
        if (node.isNode()){
            children = node.getChildren();
            for (Node childNode : children){
                getNodeList(childNode, list);
            }
        }
    }
    void getNodeListUnrecursive(Node node, Collection<Integer> list){
        if (node.isNode()){
            node.getChildren()
        }

    }
    ArrayList<Node> getChildern(Node node){
        List<Node> children = new ArrayList<Node>();
        children = node.getChildren();
        return children;
    }
}
