package single_linked_list;

import org.junit.jupiter.api.Assertions;

class SingleLinkedListTest {

  String[] testArray = new String[]{"A", "B", "C", "D", "E"};

  SingleLinkedList singleLinkedListTest = new SingleLinkedList();
  private ListItem listItem;

  @org.junit.jupiter.api.BeforeEach
  void setUp() {
    ListItem temp = null;

    for (String member : testArray) {
      temp = new ListItem(member);
      singleLinkedListTest.push(temp);
    }
    listItem = temp;

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

    System.out.println("\nAfter removeLast:\n");

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

      Assertions.assertEquals(testArray.length - 1, countItem);

    }
  }
}