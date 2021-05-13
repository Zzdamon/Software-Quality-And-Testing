package ase.cts.dp.chain;

public class TestChain {

	public static void main(String[] args) {
	
		GenericMessageHandler filterModule = new FilterModule("ENG");
		GenericMessageHandler privateModule = new PrivateMessageModule();
		GenericMessageHandler groupModule = new GroupMessageModule();
		
		filterModule.setNext(privateModule);
		privateModule.setNext(groupModule);
		
		GenericMessageHandler chatServer= filterModule;
		

		chatServer.processMessage(new Message("Heyy all!!", "@Everyone", 2));
		chatServer.processMessage(new Message("Aloha, Bob!", "@Bob", 2));
		chatServer.processMessage(new Message("I hate you, BOB!", "@Bob", 2));
	}
}
