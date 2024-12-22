public class Main {
    public static void main(String[] args) {
        int max = 0;
        for (int i = 9999; i >= 1000; i--) {
            if (i % 10 == 0 && i % 13 == 0) {
                max = i;
                break;
            }
        }
        System.out.println("The largest 4 digit number divisible by 10 and 13 is: " + max);
    }
}

git init
git add Main.java
git commit -m "Initial commit"
git branch -M main
git remote add origin https://github.com/username/repository.git
git push -u origin main


FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY Main.java /app/
RUN javac Main.java
CMD ["java", "Main"]