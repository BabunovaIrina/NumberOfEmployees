public class Main {
    public static void main(String[] args) {

        final int numberProgrammers = 7;
        System.out.println("Количество программистов - " + numberProgrammers);

        final int numberTestersPerProgrammer = 2;
        System.out.println("Количество тестировщиков на одного программиста - " + numberTestersPerProgrammer);

        final int numberSupportSpecialistPerProgrammer = 2;
        System.out.println("Количество специалистов поддержки на одного программиста - " + numberSupportSpecialistPerProgrammer);

        final int totalTestersOnProject = numberProgrammers * numberTestersPerProgrammer;
        System.out.println("На проект требутся " + totalTestersOnProject + " тестировщиков");

        final int totalSupportSpecialistOnProject = numberProgrammers * numberSupportSpecialistPerProgrammer;
        System.out.println("На проект требутся " + totalSupportSpecialistOnProject + " специалистов поддержки");

        final int totalTechnicalSpecialists = numberProgrammers + totalTestersOnProject + totalSupportSpecialistOnProject;
        System.out.println("Общее количество технических специалистов на проекте - " + totalTechnicalSpecialists);
    }
}
