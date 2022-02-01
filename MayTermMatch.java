public class MayTermMatch {
	public void checkRank(){
		int x = -1;
		int check = 19;
		//int[] rank = {8,2,7,9,6,1,10,3,5,11,12,13,14,4,15,16,17,18};
		int[] rank = {11,	5,	9,	8	,10	,15,6	,7	,4	,3	,12	,2	,13	,14	,1	,16	,17,	18};
		String[] name = {"Furniture Building",	"Adventuring",	"Digital Storytelling",	"Guilty until proven innocent",	"Reality and Ray Guns",	"You are what you eat",	"Sound City",	"Porch to Plate",	"LifeHacking",	"Animal Behavior and Conservation",	"Civil Rights Through Landmarks",	"Cincinnati Treasures",	"The Writing's on the Wall (Mural)",	"Don’t Worry, Be Happy: Mental Health in 2022",	"Publishing/Yearbook",	"Game Design",	"Intro to Engineering",	"Parks and Recreation"};
		for (int i = 0; i < 17; i ++) {
			x = x+1;
			if (rank[i] == 1) {
				i = 18;
			}
			else {
				if (rank[i] < rank[i+1]){
					if (rank[i] < check) {
						check = rank[i];
					}
				}
				else {
					if (rank[i + 1] < check) {
						check = rank[i + 1];
					}
				}
			}
		}
		System.out.println(name[x]);
		
	}
	
	
