package Demo;

import jim.utils.SerializeUtil;
import redis.clients.jedis.Jedis;

import com.pojo.SetPojo;

public class SetDemo {
	private static Jedis jedis;

	public static void main(String[] args) {
		jedis = new Jedis("localhost");
		jedis.set("foo", "bar");
		String value = jedis.get("foo");
		System.out.println(value);
		// 序列化后 保存二进制键值对
		SetPojo u = new SetPojo("jim", 25);
		jedis.set("user".getBytes(), SerializeUtil.serialize(u));
		byte[] data = jedis.get("user".getBytes());
		SetPojo user = (SetPojo) SerializeUtil.unserialize(data);
		System.out.println(user);

	}
}
