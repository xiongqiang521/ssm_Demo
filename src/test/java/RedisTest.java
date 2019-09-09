import redis.clients.jedis.Jedis;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/4 15:38
 */
public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("39.105.68.52",6379);

        // jedis.sadd("set","sdf","asdf","aa");

        System.out.println(jedis.get("name"));
        System.out.println(jedis.smembers("set"));

        jedis.close();
    }
}
