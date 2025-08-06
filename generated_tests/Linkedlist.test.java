```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Test class for the Linkedlist utility methods, specifically focusing on lengthOfLL.
 * This class uses JUnit 5 for testing.
 */
public class LinkedlistTest {

    /**
     * Test case to verify that the length of an empty list (represented by a null head)
     * is correctly reported as zero.
     */
    @Test
    void testLengthOfEmptyList() {
        // GIVEN: An empty linked list (null head)
        Node head = null;

        // WHEN: Calling lengthOfLL with a null head
        int actualLength = Linkedlist.lengthOfLL(head);

        // THEN: The method should return 0
        assertEquals(0, actualLength, "The length of an empty list should be 0.");
    }

    /**
     * Test case to verify that the length of a single-node list
     * is correctly reported as one.
     */
    @Test
    void testLengthOfSingleNodeList() {
        // GIVEN: A linked list with a single node
        Node head = new Node(10); // Node(data) constructor sets next to null

        // WHEN: Calling lengthOfLL on a single-node list
        int actualLength = Linkedlist.lengthOfLL(head);

        // THEN: The method should return 1
        assertEquals(1, actualLength, "The length of a single-node list should be 1.");
    }

    /**
     * Test case to verify that the length of a multi-node list
     * is correctly reported based on the number of nodes.
     * This test specifically builds the list manually.
     */
    @Test
    void testLengthOfMultiNodeListManualConstruction() {
        // GIVEN: A linked list with multiple nodes (e.g., 3 nodes: 10 -> 20 -> 30)
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        // WHEN: Calling lengthOfLL on a multi-node list
        int actualLength = Linkedlist.lengthOfLL(head);

        // THEN: The method should return the correct count (3)
        assertEquals(3, actualLength, "The length of a 3-node list should be 3.");
    }

    /**
     * Test case to verify that the length of a multi-node list
     * is correctly reported based on the number of nodes.
     * This test uses the ConverArr2ll helper for list creation.
     */
    @Test
    void testLengthOfMultiNodeListUsingConvertArr2ll() {
        // GIVEN: An array representing a multi-node list
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; // 7 nodes

        // GIVEN: A linked list created from the array using ConverArr2ll
        Node head = Linkedlist.ConverArr2ll(arr);
        assertNotNull(head, "The head should not be null for a non-empty array conversion.");

        // WHEN: Calling lengthOfLL on the created list
        int actualLength = Linkedlist.lengthOfLL(head);

        // THEN: The method should return the correct count (7)
        assertEquals(arr.length, actualLength, "The length of the list should match the array's length.");
    }

    /**
     * Test case to verify that the length of a list created from an array
     * via ConverArr2ll matches the original array's length,
     * including arrays with a single element.
     */
    @Test
    void testLengthOfListCreatedFromArraySingleElement() {
        // GIVEN: An array with a single element
        int[] arr = {99};

        // GIVEN: A linked list created from the array using ConverArr2ll
        Node head = Linkedlist.ConverArr2ll(arr);
        assertNotNull(head, "The head should not be null for a single-element array conversion.");
        assertNull(head.next, "A single-element array list should only have one node.");

        // WHEN: Calling lengthOfLL on the created list
        int actualLength = Linkedlist.lengthOfLL(head);

        // THEN: The method should return the array's length (1)
        assertEquals(arr.length, actualLength, "The length of the list should match the array's length (1).");
    }

    /**
     * Test case to verify that the length of a list created from an array
     * via ConverArr2ll matches the original array's length, for a typical multi-element array.
     */
    @Test
    void testLengthOfListCreatedFromArrayMultiElement() {
        // GIVEN: An array representing a linked list with multiple elements
        int[] arr = {10, 20, 30, 40};

        // GIVEN: A linked list created from the array using ConverArr2ll
        Node head = Linkedlist.ConverArr2ll(arr);
        assertNotNull(head, "The head should not be null for a non-empty array conversion.");

        // WHEN: Calling lengthOfLL on the created list
        int actualLength = Linkedlist.lengthOfLL(head);

        // THEN: The method should return the array's length (4)
        assertEquals(arr.length, actualLength, "The length of the list should match the array's length.");
    }
}
```