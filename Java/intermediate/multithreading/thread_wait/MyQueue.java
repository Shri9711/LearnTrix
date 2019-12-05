package multithreading.thread_wait;

public class MyQueue {
	private String msg;
	
	public MyQueue(String str) {
		this.msg = str;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String str) {
		this.msg = str;
	}
}
