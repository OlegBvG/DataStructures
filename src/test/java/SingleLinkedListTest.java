import static single_linked_list.SingleLinkedList.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import single_linked_list.ListItem;
import single_linked_list.SingleLinkedList;

class SingleLinkedListTest {

  String[] testArray = new String[]{"A", "B", "C", "D", "E"};
  String[] expectingArray = new String[]{"E", "D", "C", "B"};

  SingleLinkedList singleLinkedListTest = new SingleLinkedList();
  SingleLinkedList singleLinkedListExpect = new SingleLinkedList();

  private ListItem listItem;

  @org.junit.jupiter.api.BeforeEach
  void setUp() {

    singleLinkedListTest = createLinkedList(testArray);
    listItem = singleLinkedListTest.getTop();

    //--------------

    System.out.print("singleLinkedListTest: ");

    ListItem item = listItem;
    if (item != null) {
      int countItem = 1;
      System.out.print(item.getData() + " ");
      do {
        item = item.getNext();
        countItem++;
        System.out.print(item.getData() + " ");
      } while (item.getNext() != null);

      System.out.println("\nК-во членов singleLinkedListTest: " + countItem);

    }
  }


  @org.junit.jupiter.api.AfterEach
  void tearDown() {
  }

  @org.junit.jupiter.api.Test
  void removeLast() {
    singleLinkedListTest.removeLast();
    ArrayList listTest = new ArrayList();


    System.out.println("\nAfter removeLast:\n");

    System.out.print("singleLinkedListTest: ");

    ListItem item = listItem;
    if (item != null) {
      int countItem = 1;
      System.out.print(item.getData() + " ");
      listTest.add(item.getData());

      do {
        item = item.getNext();
        countItem++;
        System.out.print(item.getData() + " ");
        listTest.add(item.getData());

      } while (item.getNext() != null);

      System.out.println("\nК-во членов singleLinkedListTest: " + countItem);

      Assertions.assertArrayEquals(listTest.toArray(), expectingArray);

    }
  }
}