class PensDivision {
    public static void main(String[] args) {

        int totalPens = 14;
        int students = 3;

        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        System.out.println("Pen per student = " + pensPerStudent +
                "\nRemaining pens = " + remainingPens);
    }
}