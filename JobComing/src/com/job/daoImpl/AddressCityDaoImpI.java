package com.job.daoImpl;

import java.util.ArrayList;
import java.util.List;


import com.job.bean.AddressCity;
import com.job.bean.JobKind;
import com.job.dao.AddressCityDao;
import com.job.hibernate.CommonQuery;

public class AddressCityDaoImpI implements AddressCityDao {
	private CommonQuery query = new CommonQuery();
	/**
	 * 返回一条城市对象
	 */
	public AddressCity getAddressCity(String hql, Object[] params) {
		Object obj = query.getObj(hql, params);
		return obj == null ? null : (AddressCity) obj;
	}
	/**
	 * 通过城市名称返回所属省份的编号
	 * 
	 * @param cityName
	 * @return
	 */
	public int getProvinceCode(String cityName) {
		String hql = "from AddressCity where cityName=? ";
		Object[] params = new Object[] { cityName };
		return (int) query.getObj(hql, params);
	}

	/**
	 * 通过省份编号返回一个城市集合
	 * 
	 * @param provinceCode
	 * @return
	 */
	public List<AddressCity> getAddressCityListByPCode(int provinceCode) {
		String hql = "from AddressCity where provinceCode=?";
		Object[] params = new Object[] { provinceCode };
		List<AddressCity> list = new ArrayList<AddressCity>();
		List<Object> list2 = query.selectForList(hql, params);
		for (int i = 0; i < list2.size(); i++) {
			list.add((AddressCity) list.get(i));
		}
		return list;
	}

	/**
	 * 通过城市编码 返回一个城市对象
	 */

	public AddressCity getAddressCityByCityCode(int cityCode) {

		String hql = "from AddressCity where cityCode=?";
		Object[] params = new Object[] { cityCode };
		return getAddressCity(hql, params);
	}
	/**
	 * 通过城市名称 返回一个城市对象
	 */
	public AddressCity getAddressCityByCityName(String cityName) {
		String hql = "from AddressCity where cityName=?";
		Object[] params = new Object[] { cityName };
		return getAddressCity(hql, params);
	}
	/**
	 * 返回一个城市地址
	 * 
	 * @param hql
	 * @param params
	 * @return
	 */
	public List<AddressCity> getAddressCityList(String hql, Object[] params) {
		List<AddressCity> list = new ArrayList<AddressCity>();
		List<Object> list2 = new ArrayList<Object>();
		list2 = query.selectForList(hql, params);
		for (int i = 0; i < list2.size(); i++) {
			list.add((AddressCity) list2.get(i));
		}
		return list;
	}
}
