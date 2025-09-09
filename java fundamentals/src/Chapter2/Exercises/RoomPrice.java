package Chapter2.Exercises;

import javax.swing.*;

public class RoomPrice {
    public static void main(String[] args) {
        int price = 0;
        String bedChoice = JOptionPane.showInputDialog(
                "Choose a room type:\n" +
                        "A - Queen Bed ($125)\n" +
                        "B - King Bed ($139)\n" +
                        "C - King + Pullout Couch ($165)");

        if (bedChoice == null) {
            JOptionPane.showMessageDialog(null, "Operation cancelled.");
            return;
        }

        bedChoice = bedChoice.trim().toUpperCase();

        switch (bedChoice) {
            case "A":
                price = 125;
                break;
            case "B":
                price = 139;
                break;
            case "C":
                price = 165;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid room type. Price set to $0.");
                JOptionPane.showMessageDialog(null, "Total Price: $" + price);
                return;
        }

        // Ask for view only if room type is valid
        String viewChoice = JOptionPane.showInputDialog(
                "Choose a view:\n" +
                        "1 - Lake View (+$15)\n" +
                        "2 - Park View (+$0)");

        if (viewChoice == null) {
            JOptionPane.showMessageDialog(null, "Operation cancelled.");
            return;
        }

        viewChoice = viewChoice.trim();

        if (viewChoice.equals("1")) {
            price += 15;
        } else if (!viewChoice.equals("2")) {
            JOptionPane.showMessageDialog(null, "Invalid view type. Price set to $0.");
            price = 0;
        }

        JOptionPane.showMessageDialog(null, "Total Price: $" + price);
    }
}
