import java.io.*;
import java.util.*;

public class SinglyLinkedList <T>
{
	private Node head;
	private Node tail;

	public SinglyLinkedList()
	{
		head = null;
		tail = null;
	}

	public static void main(String[]args)
	{
		SinglyLinkedList list = new SinglyLinkedList();
		list.run();
	}

	public void run()
	{
		printList();
		System.out.println();
		System.out.println();
		System.out.println();
		insert(head, new Node("surya"));
		printList();
		System.out.println();
		insert(head, new Node("dantuluri"));
		printList();
		System.out.println();
		delete(head);
	}

	public void insert(Node curNode, Node newNode)
	{
		//Empty list
		if(head == null)
		{
			System.out.println("first");
			head = newNode;
			tail = newNode;
		}
		//All else
		else if(curNode.get().equals(tail.get()))
		{
			System.out.println("second");
			tail.setNext(newNode);
			tail = newNode;
		}
		else
		{
			System.out.println("third");
			newNode.next = curNode.next;
			curNode.next = newNode;
		}
	}

	public void delete(Node curNode)
	{
		// Special case, remove head
		if (curNode==head) 
		{
			System.out.println("curNode is head");

			head = curNode;
			head.setNext(curNode.next);


			sucNode = list->head->next
			list->head = sucNode

			if (sucNode is null) 
			{ 
				// Removed last item
				list->tail = null
		}
		// else if (curNode->next is not null) 
		// {
		// 	sucNode = curNode->next->next
		// 	curNode->next = sucNode

		// 	if (sucNode is null) 
		// 	{ // Removed tail
		// 		list->tail = curNode
		// 	}
		// }
	}

	// public Object gethead()
	// {
	// 	if (head == null)
	// 	{
	// 		throw new NoSuchElementException();
	// 	}
	// 	else
	// 	{
	// 		return head.getValue();
	// 	}
	// }

	// public Object gettail()
	// {
	// 	ListNode temp = head;
	// 	while(temp.getNext() != null)
	// 	{
	// 	   temp = temp.getNext();
	// 	}
	// 	return temp.getValue();
	// }

	// public void addhead(Object value)
	// {
	// 	head = new ListNode(value, head);
	// }

	// public void addtail(Object value)
	// {
	// 	if(head == null)
	// 	{
	// 		head = new ListNode(value, null);
	// 		tail = new ListNode(value, null);
	// 	}
	// 	else
	// 	{
	// 		ListNode temp = head;
	// 		while(temp.getNext() != null)
	// 		{
	// 		   temp = temp.getNext();
	// 		}
	// 		temp.setNext(new ListNode(value, null));
	// 	}
	// }

	// public int size()
	// {
	// 	int sizeCount = 0;
	// 	Node temp = head; // start at the head node
	// 	while (temp != null)
	// 	{
	// 		sizeCount++;
	// 		temp = temp.getNext(); // go to next node
	// 	}
	// 	return sizeCount;
	// }


	public void printList()
	{
		Node temp = head; // start at the head node
		while (temp != null)
		{
			System.out.print(temp.get() + " ");
			temp = temp.next; // go to next node
		}
	}
}