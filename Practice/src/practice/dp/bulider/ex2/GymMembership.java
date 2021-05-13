package practice.dp.bulider.ex2;

public class GymMembership {
 String name;
 GymMembershipType type;
 boolean hasStudentDiscount, hasPoolAccess, hasSaunaAccess, isVIP;
 TrainerInterface personalTrainer;

 public GymMembership(String name, GymMembershipType type, boolean hasStudentDiscount, boolean hasPoolAccess,
		boolean hasSaunaAccess, boolean isVIP, TrainerInterface personalTrainer) {
	super();
	this.name = name;
	this.type = type;
	this.hasStudentDiscount = hasStudentDiscount;
	this.hasPoolAccess = hasPoolAccess;
	this.hasSaunaAccess = hasSaunaAccess;
	this.isVIP = isVIP;
	this.personalTrainer = personalTrainer;
}
 
 


private GymMembership() {}
 
 public static class GymMembershipBuilder{
	 private GymMembership gymMembership;
	 
	 public GymMembershipBuilder(String name, GymMembershipType type) {
		 this.gymMembership= new GymMembership();
		 this.gymMembership.name= name;
		 this.gymMembership.type=type ;
		 
	 }
	 
	 public GymMembership build() {
		 return this.gymMembership;
	 }
	 
	 public GymMembershipBuilder setHasStudentDiscount() {
			this.gymMembership.hasStudentDiscount = true;
			return this;
		}


		public GymMembershipBuilder setHasPoolAccess() {
			this.gymMembership.hasPoolAccess = true;
			return this;

		}


		public GymMembershipBuilder setHasSaunaAccess() {
			this.gymMembership.hasSaunaAccess = true;
			return this;

		}


		public GymMembershipBuilder setVIP() {
			this.gymMembership.isVIP = true;
			return this;

		}


		public GymMembershipBuilder setPersonalTrainer(TrainerInterface personalTrainer) {
			this.gymMembership.personalTrainer = personalTrainer;
			return this;

		}

	 
 }
 
}
