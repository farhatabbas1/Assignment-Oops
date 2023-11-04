class StudentData {
    public static void main(String[] args) {
        // Declare and initialize the StudentData string
        String studentData = "John:85,Alice:95, Bob:78, Barol:95, David:88, Emma:79, Frank:90";

        // Split the studentData string into an array of individual student records
        String[] studentRecords = studentData.split(",");

        // Create arrays to store student names and scores
        String[] studentNames = new String[studentRecords.length];
        int[] studentScores = new int[studentRecords.length];

        // Populate the arrays by extracting data from the split records
        for (int i = 0; i < studentRecords.length; i++) {
            String[] recordParts = studentRecords[i].split(":");
            if (recordParts.length == 2) {
                // Extract the name and score
                String name = recordParts[0].trim();
                int score = Integer.parseInt(recordParts[1].trim());

                // Store the name and score in their respective arrays
                studentNames[i] = name;
                studentScores[i] = score;
            } else {
                System.out.println("Invalid record: " + studentRecords[i]);
            }
        }

        // Calculate and display the total number of students
        int totalStudents = studentNames.length;
        System.out.println("Total number of students: " + totalStudents);

        // Calculate and display the average score of all students
        int totalScore = 0;
        for (int score : studentScores) {
            totalScore += score;
        }
        double averageScore = (double) totalScore / totalStudents;
        System.out.println("Average score of all students: " + averageScore);

        // Find and display the highest score and the name of the student who achieved it
        int highestScore = -1;
        String highestScorer = "";
        for (int i = 0; i < studentScores.length; i++) {
            if (studentScores[i] > highestScore) {
                highestScore = studentScores[i];
                highestScorer = studentNames[i];
            }
        }
        System.out.println("Highest score: " + highestScore);
        System.out.println("Student with the highest score: " + highestScorer);

        // Find and display the lowest score and the name of the student who achieved it
        int lowestScore = Integer.MAX_VALUE;
        String lowestScorer = "";
        for (int i = 0; i < studentScores.length; i++) {
            if (studentScores[i] < lowestScore) {
                lowestScore = studentScores[i];
                lowestScorer = studentNames[i];
            }
        }
        System.out.println("Lowest score: " + lowestScore);
        System.out.println("Student with the lowest score: " + lowestScorer);
    }
}
