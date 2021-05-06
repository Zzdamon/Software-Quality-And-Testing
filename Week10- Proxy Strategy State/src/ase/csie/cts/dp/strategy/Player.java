package ase.csie.cts.dp.strategy;

public class Player {

	String userName;
	int playTime;
	int experiencePoints;
	BonusStrategyInterface bonusCampaign=null; //or new NoCampaign - if i want a default one
	
	
	
	public void setBonusCampaign(BonusStrategyInterface bonusCampaign) {
		this.bonusCampaign = bonusCampaign;
	}

	public Player(String userName, int playTime, int experiencePoints) {
		super();
		this.userName = userName;
		this.playTime = playTime;
		this.experiencePoints = experiencePoints;
	}
	
	public void  getExperiencePoints(int pointsReceived) {
		if(this.bonusCampaign!=null) {
			this.bonusCampaign.getBonusPoints(pointsReceived,this);
		}
	}
}
