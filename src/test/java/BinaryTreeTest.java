import binary_tree.BinaryTree;
import binary_tree.Node;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

  String[] expectingTreeString = {"1", "10", "2", "3", "4", "5", "6", "7", "8", "9", "91"};
  String[] treeString = {"91", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
  BinaryTree tree;

  @BeforeEach
  void setUp() {

    tree = new BinaryTree();
    for (String memberTreeString : treeString
    ) {
      tree.addNode(memberTreeString);
    }


  }

  @AfterEach
  void tearDown() {
  }


  @Test
  void searchNodes() {

    ArrayList<Node> listNode = tree.searchNodes(tree.getRoot());
    System.out.println("Count nodes of tree = " + listNode.size());

    for (Node nodeInList : listNode) {
      nodeInList.printNode();
    }

    ArrayList<String> treeStringTest = new ArrayList<>();
    ArrayList<String> finalTreeStringTest = treeStringTest;
    listNode.stream().forEach(n -> finalTreeStringTest.add(n.getData()));

    System.out.print("Expecting list: ");
    for (String s : expectingTreeString) {
      System.out.print(s + " - ");
    }
    System.out.println("\n==========================");


    System.out.print("   Actual list: ");
    for (String s : finalTreeStringTest) {
      System.out.print(s + " - ");
    }

    finalTreeStringTest.toArray();
    Assert.assertArrayEquals(expectingTreeString, finalTreeStringTest.toArray());

  }
}