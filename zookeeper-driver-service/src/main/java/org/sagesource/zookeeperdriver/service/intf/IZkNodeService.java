package org.sagesource.zookeeperdriver.service.intf;

import org.sagesource.zookeeperdriver.helper.exception.ZkDriverBusinessException;
import org.sagesource.zookeeperdriver.helper.exception.ZkDriverPlatformException;
import org.sagesource.zookeeperdriver.service.dto.ZkDataDto;
import org.sagesource.zookeeperdriver.service.dto.ZkNodeDto;
import org.sagesource.zookeeperdriver.service.dto.ZkNodeWatcherInfoDto;

import java.util.List;

/**
 * <p>ZK节点操作Service</p>
 * <pre>
 *     author      Sage XueQi
 *     date        2016/12/1
 *     email       job.xueqi@gmail.com
 * </pre>
 */
public interface IZkNodeService {

	/**
	 * 判断节点是否存在
	 *
	 * @param clientKey
	 * @param path      待检查节点
	 * @return true:存在 false:不存在
	 */
	boolean checkNodeExist(String clientKey, String path) throws ZkDriverPlatformException, ZkDriverBusinessException;

	/**
	 * 获得节点的子节点列表
	 *
	 * @param clientKey
	 * @param parentPath 当前节点
	 * @return
	 */
	List<ZkNodeDto> findChildrenNode(String clientKey, String parentPath) throws ZkDriverBusinessException, ZkDriverPlatformException;

	/**
	 * 获取节点的数据
	 *
	 * @param clientKey
	 * @param path      当前节点
	 * @return
	 */
	ZkDataDto readNodeData(String clientKey, String path) throws ZkDriverBusinessException, ZkDriverPlatformException;

	/**
	 * 创建节点
	 *
	 * @param clientKey
	 * @param path      节点
	 * @param data      数据
	 */
	void createNode(String clientKey, String path, String data) throws ZkDriverBusinessException, ZkDriverPlatformException;

	/**
	 * 更新节点数据
	 *
	 * @param clientKey
	 * @param path      节点路径
	 * @param data      更新数据
	 * @throws Exception
	 */
	void editNodeData(String clientKey, String path, String data) throws ZkDriverBusinessException, ZkDriverPlatformException;

	/**
	 * 删除节点
	 *
	 * @param clientKey
	 * @param path      删除节点
	 * @throws Exception
	 */
	void deleteNode(String clientKey, String path) throws ZkDriverBusinessException, ZkDriverPlatformException;

	/**
	 * 查询节点的Watcher信息
	 *
	 * @param clientKey
	 * @param path      节点路径
	 * @return
	 *
	 * @throws ZkDriverBusinessException
	 * @throws ZkDriverPlatformException
	 */
	List<ZkNodeWatcherInfoDto> findWatcherInfo(String clientKey, String path) throws ZkDriverBusinessException, ZkDriverPlatformException;
}
