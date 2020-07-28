package com.ppdtbb.jedis;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

//Jedis连接Redis集群
public class TestJedis {
	
	@Test
	public void testJedis() {
		
		Set<HostAndPort> nodes = new HashSet<>();
		nodes.add(new HostAndPort("192.168.42.62", 7291));
		nodes.add(new HostAndPort("192.168.42.62", 7292));
		nodes.add(new HostAndPort("192.168.42.62", 7293));
		nodes.add(new HostAndPort("192.168.42.62", 7294));
		nodes.add(new HostAndPort("192.168.42.62", 7295));
		nodes.add(new HostAndPort("192.168.42.62", 7296));
		
		JedisCluster cluster = new JedisCluster(nodes);
		cluster.set("cluster-test", "my jedis cluster test.");
		
		String result = cluster.get("cluster-test");
		System.out.println(result);
		
		cluster.close();
	}
	
}
