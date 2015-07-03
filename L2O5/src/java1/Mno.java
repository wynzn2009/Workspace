package java1;

public class Mno{
	private Object[] items = new Object[5];
	private Object notEmpty = new Object();
	private Object notFull = new Object();
	int count, putidx, takeidx;

	public void put(Object obj) throws InterruptedException {
		synchronized (notFull) {
			while (count == items.length) {
				notFull.wait();
			}
		}
		items[putidx] = obj;
		if (++putidx == items.length) {
			putidx = 0;
		}
		count++;
		synchronized (notEmpty) {
			notEmpty.notify();
		}
	}

	public Object take() throws InterruptedException {
		synchronized (notEmpty) {
			while (count == 0) { // 啥也没有呢 取啥
				notEmpty.wait();
			}
		}
		Object x = items[takeidx];
		System.out.println("取第" + takeidx + "个苹果" + x);
		if (++takeidx == items.length) {
			takeidx = 0;
		}
		count--;
		synchronized (notFull) {
			notFull.notify();
		}
		return x;
	}

	public static void main(String[] args) throws InterruptedException {
		final Mno bb = new Mno();
		System.out.println(Thread.currentThread() + "," + bb);

		new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
					System.out.println(Thread.currentThread() + "," + bb);
					bb.put("xx");
					bb.put("yy");
					bb.put("zz");
					bb.put("zz");
					bb.put("zz");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		bb.take();
		bb.take();
	}
}

