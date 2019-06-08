import redis.clients.jedis.Jedis;

public class TestRedis {
    public static void main(String[] args) {
        Jedis jedis = RedisUtil.getJedis();
        jedis.set("key","value1");
        jedis.close();
        String srt = jedis.get("key");
        System.out.println("获取到redis里的值：key："+srt);
    }
}
