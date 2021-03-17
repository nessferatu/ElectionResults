


public class Election {
    private int[][] votes = {{1000,2000,1500},
                               {600,3200,4000},
                                {850,1800,1600}};
    private String winner;
    private String[] candidates={"Wood","Caldwell","Moore"};
    private int[] totals = new int[3];
    private int totalVotes;
    private double percentVotes,finalCount;

    public void countVotes(){
        for(int row=0;row<votes.length;row++){
            totalVotes=0;
            for(int col=0; col<votes[row].length;col++){
                totalVotes+=votes[row][col];
                totals[row]=totalVotes;
            }
            System.out.println("Total votes for Candidate "+candidates[row]+" is "+totalVotes);
        }
    }

    public void percentVotes(){

        for(int index=0;index<totals.length;index++){
            finalCount+=totals[index];
        }
        System.out.println("The total number of votes from all three districts is "+finalCount+"\n");

        for(int index=0;index<totals.length;index++){
            percentVotes=totals[index]/finalCount*100;
            System.out.printf("The total percentage of votes for Candidate "+candidates[index]+" is %.2f\n",percentVotes);
        }
    }

    public void declareWinner(){
        int highest=0;
        for(int index=0;index<candidates.length;index++){
            for (index=0;index<totals.length;index++) {
                if (totals[index] > highest) {
                    highest = totals[index];
                    winner = candidates[index];
                }
            }
        }
        System.out.println("The winner of the election is Candidate "+winner+".");
    }
}
