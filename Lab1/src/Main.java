
public class Main {
    public static void main(String[] args) {
        SortView view = new SortView();
        int size = view.getInputSize();

        SortModel model = new SortModel(size);
        SortController controller = new SortController(model);

        view.printArray(model.getArray(), "Original Array:");

        int choice;

        do {
            choice = view.displayMenu();

            switch (choice) {
                case 1:
                    controller.bubbleSort();
                    view.printArray(model.getArray(), "Array after Bubble Sort:");
                    break;
                case 2:
                    controller.quickSort(0, size - 1);
                    view.printArray(model.getArray(), "Array after Quick Sort:");
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            }
        } while (choice != 3);
        }
    }
