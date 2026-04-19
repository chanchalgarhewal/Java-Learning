import java .util.*;

class Voter {
    int id;
    boolean hasVoted;

    Voter(int id) {
        this.id = id;
    }
}
class Candidate {
    String name;
    int votes;

    Candidate(String name) {
        this.name = name;
        this.votes = 0;
            }
        }
        public class OnlineVotingSystem {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Candidate c1 = new Candidate("Alice");
                Candidate c2 = new Candidate("Bob");

                ArrayList<Voter> Voters = new ArrayList<>();
                Voters.add(new Voter(101));
                Voters.add(new Voter(102));
                Voters.add(new Voter(103));

                System.out.println("Enter your Voter ID:");
                int id = sc.nextInt();

                boolean found = false;

                for (Voter v : Voters) {
                    if (v.id == id) {
                        found = true;

                        if (v.hasVoted) {
                            System.out.println("You have already voted!");
                        } else {
                            System.out.println("1.Alice");
                            System.out.println("2.Bob");
                            System.out.println("Choose candidate:");
                            int choice = sc.nextInt();


                            if (choice == 1) {
                                c1.votes++;
                            } else if (choice == 2) {
                                c2.votes++;
                            } else {
                                System.out.println("Invalid choice!");
                                return;
                            }
                            v.hasVoted = true;
                            System.out.println("Vote submitted successfullay!");
                        }
                    }
                }
                if (!found) {
                    System.out.println("Invalid Voter ID!");
                }
                System.out.println("\n__Results__");
                System.out.println("Alice:" + c1.votes);
                System.out.println("Bob:" + c2.votes);
            }
        }