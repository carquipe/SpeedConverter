
class exercise{

        public abstract class CustomListItem {
            protected CustomListItem previous = null;
            protected CustomListItem next = null;
            protected Object value;

            public CustomListItem(Object value){
                this.value = value;
            }
            abstract CustomListItem previous();
            abstract CustomListItem next();
            abstract CustomListItem setNext(CustomListItem next);
            abstract CustomListItem setPrevious(CustomListItem previous);
            abstract int compareTo(CustomListItem comparingItem);
            
            public Object getValue(){
                return value;
            }

            public void setValue(Object value){
                this.value = value;
            }
        }

        public class ConcreteCustomListItem extends CustomListItem{
            public ConcreteCustomListItem(Object value){
                super(value);
            }

            @Override
            CustomListItem next(){
                return next;
            }

            @Override
            CustomListItem previous(){
                return previous;
            }

            @Override
            CustomListItem setNext(CustomListItem next){
                this.next = next;
                return this.next;
            }

            @Override
            CustomListItem setPrevious(CustomListItem previous){
                this.previous = previous;
                return this.previous;
            }

            @Override
            int compareTo(CustomListItem item){
                if(item == null){
                    return -1;
                } else {
                    return ((String) super.getValue()).compareTo((String) item.getValue());
                }
            }
        }

        public interface IConcreteList{
            CustomListItem getRoot();
            boolean addItem(CustomListItem item);
            boolean removeItem(CustomListItem item);
            void traverse(CustomListItem root);
        }
        public class ConcreteLinkedList implements IConcreteList{
            private CustomListItem root = null;

            public ConcreteLinkedList(CustomListItem root){
                this.root = root;
            }

            @Override
            public CustomListItem getRoot(){
                return getRoot();
            }

            public boolean addItem(CustomListItem item){
                if(this.root == null){
                    this.root = item;
                    return true;
                }

                CustomListItem current = this.root;
                while(current != null){
                    int comparacion = current.compareTo(item);
                    if(comparacion < 0){
                        if(current.next() != null){
                            current = current.next();
                        } else {
                            current.setNext(item);
                            item.setPrevious(current);
                            return true;
                        }
                    } else if (comparacion > 0){
                        if(current.previous() != null){
                            current.previous().setNext(item);
                            item.previous().setPrevious(current.previous());
                            item.next().setNext(current);
                            current.previous.setPrevious(item);
                        } else {
                            item.setNext(current);
                            current.setPrevious(item);
                            root = item;
                        }
                        return true;
                    } else {
                        System.out.println(item.getValue() + " already in list");
                        return false;
                    }
                }
                return false;
            }
            public boolean removeItem(CustomListItem item){
                CustomListItem current = root;

                while(current != null){
                    int comparacion = current.compareTo(item);
                    if(comparacion == 0){
                        if(root == current){
                            root = current.next();
                        } else {
                            current.previous().setNext(current.next());
                            if(current.next() != null){
                                current.next().setPrevious(item);
                            }
                        }
                        return true;
                    } else if (comparacion < 0){
                        current = current.next();
                    } else {
                        return false;
                    }
                }
                return false;

            }
            public void traverse(CustomListItem item){
                if(item != null){
                    System.out.println(item.getValue());
                    traverse(item.next());
                }
            }
        }
        // For this challenge, create an abstract class to define items that can be stored in a list.
        // The class should contain 2 references to items which will represent the next and previous
        // items (in the case of a linked list).
        // I.e., if you call your abstract class ListItem, then it would have 2 member variables of
        // type ListItem that will hold references to the next/right and previous/left ListItems.
        //
        // The abstract class will also need to hold a value - try to be as flexible as possible
        // when defining the type of this value.
        //
        // The class will also need methods to move to the next item and back to the previous item,
        // and methods to set the next and previous items.
        //
        // You should also specify a compareTo() method that takes a parameter of the same type as the
        // class and returns 0 if the values are equal, greater than zero if the value sorts greater than
        // the parameter and less than zero if it sorts less than the parameter.
        //
        // Create a concrete class from your abstract list item class and use this in a LinkedList
        // class to implement a linked list that will add items in order (so that they are sorted
        // alphabetically). Duplicate values are not added.
        //
        // Note that you are creating your own LinkedList class here, not using the built-in Java one..
        //
        // The rules for adding an item to the linked list are:
        //  If the head of the list is null, make the head refer to the item to be added.
        //  If the item to be added is less than the current item in the list, add the item before the
        //      current item (i.e., make the previous item's "next" refer to the new item, and the new item's
        //      "next" refer to the current item).
        //  If the item to be added is greater than the current item, move onto the next item and compare
        //      again (if there is no next item then that is where the new item belongs).
        //
        // Care will be needed when inserting before the first item in the list (as it will not have a previous
        // item).
        //
        // You will also need a method to remove an item from the list.
        //
        // Hint: If you are creating classes with names such as List, LinkedList, Node etc, make sure that
        // you create your classes before referring to them. In previous videos we have often referred to
        // classes that we create later, but if you use names that IntelliJ recognises as Java classes (such
        // as LinkedList) then it will create imports for them and possibly cause you problems later.
        //
        // Optional: create a class to use your concrete class to implement a Binary Search Tree:
        // When adding items to a Binary Search Tree, if the item to be added is less than the current item
        // then move to the left, if it is greater than the current item then move to the right.
        //
        // The new item is added when an attempt to move in the required direction would involve following a
        // null reference.
        // Once again, duplicates are not allowed.
        //
        // Hint: to avoid typing loads of "addItem" lines, split a string into an array and create your list in
        // a loop as in the example below.
        //
        // Create a string data array to avoid typing loads of addItem instructions:

        public static void main(String[] args){
            String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

            String[] data = stringData.split(" ");
            for (String s : data) {
                // create new item with value set to the string s
            }
        }
}