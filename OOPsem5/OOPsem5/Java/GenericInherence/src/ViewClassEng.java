// Интерфейс для получения представления

import java.util.HashMap;

interface iGetView {
    void displayView();
}

// Класс представления на английском языке
public class ViewClassEng implements iGetView {
    @Override
    public void displayView() {
        System.out.println("Welcome to the student management system.");
    }
}

// Класс модели с хранилищем типа HashMap<int, Student>
class ModelClassHash implements iGetModel {
    @SuppressWarnings("rawtypes")
    private HashMap<Integer, Student> studentMap;

    // Метод удаления студента из хранилища
    public void deleteStudent(int studentId) {
        if (studentMap.containsKey(studentId)) {
            studentMap.remove(studentId);
            System.out.println("Student with ID " + studentId + " has been deleted.");
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }
}

// Контроллер
class Controller {
    private ViewClassEng view;
    private ModelClassHash model;

    // Метод выполнения программы
    /**
     * 
     */
    public void run() {
        view.displayView();

        int userInput;
        // Добавление команды DELETE в switch
        switch (userInput) {
            case "DELETE":
                System.out.println("Enter the student ID to delete:");
                Object scanner;
                int studentId = scanner.nextInt();
                model.deleteStudent(studentId);
                break;
            default:
                System.out.println("Invalid command.");
        }
    }
}
