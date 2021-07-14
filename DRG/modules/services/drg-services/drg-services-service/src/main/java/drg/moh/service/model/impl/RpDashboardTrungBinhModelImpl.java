/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package drg.moh.service.model.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import drg.moh.service.model.RpDashboardTrungBinh;
import drg.moh.service.model.RpDashboardTrungBinhModel;
import drg.moh.service.model.RpDashboardTrungBinhSoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the RpDashboardTrungBinh service. Represents a row in the &quot;DRG_RpDashboardTrungBinh&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>RpDashboardTrungBinhModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RpDashboardTrungBinhImpl}.
 * </p>
 *
 * @author SON
 * @see RpDashboardTrungBinhImpl
 * @generated
 */
@JSON(strict = true)
public class RpDashboardTrungBinhModelImpl
	extends BaseModelImpl<RpDashboardTrungBinh>
	implements RpDashboardTrungBinhModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a rp dashboard trung binh model instance should use the <code>RpDashboardTrungBinh</code> interface instead.
	 */
	public static final String TABLE_NAME = "DRG_RpDashboardTrungBinh";

	public static final Object[][] TABLE_COLUMNS = {{"data_", Types.VARCHAR}};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("data_", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table DRG_RpDashboardTrungBinh (data_ VARCHAR(75) not null primary key)";

	public static final String TABLE_SQL_DROP =
		"drop table DRG_RpDashboardTrungBinh";

	public static final String ORDER_BY_JPQL =
		" ORDER BY rpDashboardTrungBinh.data ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY DRG_RpDashboardTrungBinh.data_ ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static final boolean ENTITY_CACHE_ENABLED = true;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static final boolean FINDER_CACHE_ENABLED = true;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static final boolean COLUMN_BITMASK_ENABLED = true;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long DATA_COLUMN_BITMASK = 1L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static RpDashboardTrungBinh toModel(
		RpDashboardTrungBinhSoap soapModel) {

		if (soapModel == null) {
			return null;
		}

		RpDashboardTrungBinh model = new RpDashboardTrungBinhImpl();

		model.setData(soapModel.getData());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static List<RpDashboardTrungBinh> toModels(
		RpDashboardTrungBinhSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<RpDashboardTrungBinh> models = new ArrayList<RpDashboardTrungBinh>(
			soapModels.length);

		for (RpDashboardTrungBinhSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		drg.moh.service.service.util.ServiceProps.get(
			"lock.expiration.time.drg.moh.service.model.RpDashboardTrungBinh"));

	public RpDashboardTrungBinhModelImpl() {
	}

	@Override
	public String getPrimaryKey() {
		return _data;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setData(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _data;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Class<?> getModelClass() {
		return RpDashboardTrungBinh.class;
	}

	@Override
	public String getModelClassName() {
		return RpDashboardTrungBinh.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<RpDashboardTrungBinh, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<RpDashboardTrungBinh, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<RpDashboardTrungBinh, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((RpDashboardTrungBinh)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<RpDashboardTrungBinh, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<RpDashboardTrungBinh, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(RpDashboardTrungBinh)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<RpDashboardTrungBinh, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<RpDashboardTrungBinh, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, RpDashboardTrungBinh>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			RpDashboardTrungBinh.class.getClassLoader(),
			RpDashboardTrungBinh.class, ModelWrapper.class);

		try {
			Constructor<RpDashboardTrungBinh> constructor =
				(Constructor<RpDashboardTrungBinh>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<RpDashboardTrungBinh, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<RpDashboardTrungBinh, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<RpDashboardTrungBinh, Object>>
			attributeGetterFunctions =
				new LinkedHashMap
					<String, Function<RpDashboardTrungBinh, Object>>();
		Map<String, BiConsumer<RpDashboardTrungBinh, ?>>
			attributeSetterBiConsumers =
				new LinkedHashMap
					<String, BiConsumer<RpDashboardTrungBinh, ?>>();

		attributeGetterFunctions.put("data", RpDashboardTrungBinh::getData);
		attributeSetterBiConsumers.put(
			"data",
			(BiConsumer<RpDashboardTrungBinh, String>)
				RpDashboardTrungBinh::setData);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getData() {
		if (_data == null) {
			return "";
		}
		else {
			return _data;
		}
	}

	@Override
	public void setData(String data) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_data = data;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (entry.getValue() != getColumnValue(entry.getKey())) {
				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public RpDashboardTrungBinh toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, RpDashboardTrungBinh>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		RpDashboardTrungBinhImpl rpDashboardTrungBinhImpl =
			new RpDashboardTrungBinhImpl();

		rpDashboardTrungBinhImpl.setData(getData());

		rpDashboardTrungBinhImpl.resetOriginalValues();

		return rpDashboardTrungBinhImpl;
	}

	@Override
	public int compareTo(RpDashboardTrungBinh rpDashboardTrungBinh) {
		String primaryKey = rpDashboardTrungBinh.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RpDashboardTrungBinh)) {
			return false;
		}

		RpDashboardTrungBinh rpDashboardTrungBinh =
			(RpDashboardTrungBinh)object;

		String primaryKey = rpDashboardTrungBinh.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<RpDashboardTrungBinh> toCacheModel() {
		RpDashboardTrungBinhCacheModel rpDashboardTrungBinhCacheModel =
			new RpDashboardTrungBinhCacheModel();

		rpDashboardTrungBinhCacheModel.data = getData();

		String data = rpDashboardTrungBinhCacheModel.data;

		if ((data != null) && (data.length() == 0)) {
			rpDashboardTrungBinhCacheModel.data = null;
		}

		return rpDashboardTrungBinhCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<RpDashboardTrungBinh, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(4 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<RpDashboardTrungBinh, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<RpDashboardTrungBinh, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(
				attributeGetterFunction.apply((RpDashboardTrungBinh)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<RpDashboardTrungBinh, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<RpDashboardTrungBinh, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<RpDashboardTrungBinh, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(
				attributeGetterFunction.apply((RpDashboardTrungBinh)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, RpDashboardTrungBinh>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _data;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<RpDashboardTrungBinh, Object> function =
			_attributeGetterFunctions.get(columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((RpDashboardTrungBinh)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("data_", _data);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("data_", "data");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("data_", 1L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private RpDashboardTrungBinh _escapedModel;

}