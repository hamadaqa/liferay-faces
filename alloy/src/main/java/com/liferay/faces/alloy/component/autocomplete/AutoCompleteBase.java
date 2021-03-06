/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
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
package com.liferay.faces.alloy.component.autocomplete;
//J-

import javax.annotation.Generated;
import com.liferay.faces.alloy.component.inputtext.InputText;

import com.liferay.faces.util.component.Styleable;
import com.liferay.faces.util.component.ClientComponent;

/**
 * @author	Bruno Basto
 * @author	Kyle Stiemann
 */
@Generated(value = "com.liferay.alloy.tools.builder.FacesBuilder")
public abstract class AutoCompleteBase extends InputText implements Styleable, ClientComponent {

	// Protected Enumerations
	protected enum AutoCompletePropertyKeys {
		activateFirstItem,
		autoScroll,
		circular,
		clientCustomFilter,
		clientFilterType,
		clientKey,
		delay,
		delimiter,
		height,
		highlighterType,
		itemSelectListener,
		listItemRequired,
		maxItems,
		minChars,
		serverCustomFilter,
		serverFilterType,
		tabSelect,
		width
	}

	public Boolean isActivateFirstItem() {
		return (Boolean) getStateHelper().eval(AutoCompletePropertyKeys.activateFirstItem, true);
	}

	public void setActivateFirstItem(Boolean activateFirstItem) {
		getStateHelper().put(AutoCompletePropertyKeys.activateFirstItem, activateFirstItem);
	}

	public Boolean isAutoScroll() {
		return (Boolean) getStateHelper().eval(AutoCompletePropertyKeys.autoScroll, null);
	}

	public void setAutoScroll(Boolean autoScroll) {
		getStateHelper().put(AutoCompletePropertyKeys.autoScroll, autoScroll);
	}

	public Boolean isCircular() {
		return (Boolean) getStateHelper().eval(AutoCompletePropertyKeys.circular, null);
	}

	public void setCircular(Boolean circular) {
		getStateHelper().put(AutoCompletePropertyKeys.circular, circular);
	}

	public String getClientCustomFilter() {
		return (String) getStateHelper().eval(AutoCompletePropertyKeys.clientCustomFilter, null);
	}

	public void setClientCustomFilter(String clientCustomFilter) {
		getStateHelper().put(AutoCompletePropertyKeys.clientCustomFilter, clientCustomFilter);
	}

	public String getClientFilterType() {
		return (String) getStateHelper().eval(AutoCompletePropertyKeys.clientFilterType, null);
	}

	public void setClientFilterType(String clientFilterType) {
		getStateHelper().put(AutoCompletePropertyKeys.clientFilterType, clientFilterType);
	}

	@Override
	public String getClientKey() {
		return (String) getStateHelper().eval(AutoCompletePropertyKeys.clientKey, null);
	}

	@Override
	public void setClientKey(String clientKey) {
		getStateHelper().put(AutoCompletePropertyKeys.clientKey, clientKey);
	}

	public Integer getDelay() {
		return (Integer) getStateHelper().eval(AutoCompletePropertyKeys.delay, null);
	}

	public void setDelay(Integer delay) {
		getStateHelper().put(AutoCompletePropertyKeys.delay, delay);
	}

	public String getDelimiter() {
		return (String) getStateHelper().eval(AutoCompletePropertyKeys.delimiter, null);
	}

	public void setDelimiter(String delimiter) {
		getStateHelper().put(AutoCompletePropertyKeys.delimiter, delimiter);
	}

	public String getHeight() {
		return (String) getStateHelper().eval(AutoCompletePropertyKeys.height, null);
	}

	public void setHeight(String height) {
		getStateHelper().put(AutoCompletePropertyKeys.height, height);
	}

	public String getHighlighterType() {
		return (String) getStateHelper().eval(AutoCompletePropertyKeys.highlighterType, null);
	}

	public void setHighlighterType(String highlighterType) {
		getStateHelper().put(AutoCompletePropertyKeys.highlighterType, highlighterType);
	}

	public javax.el.MethodExpression getItemSelectListener() {
		return (javax.el.MethodExpression) getStateHelper().eval(AutoCompletePropertyKeys.itemSelectListener, null);
	}

	public void setItemSelectListener(javax.el.MethodExpression itemSelectListener) {
		getStateHelper().put(AutoCompletePropertyKeys.itemSelectListener, itemSelectListener);
	}

	public Boolean isListItemRequired() {
		return (Boolean) getStateHelper().eval(AutoCompletePropertyKeys.listItemRequired, false);
	}

	public void setListItemRequired(Boolean listItemRequired) {
		getStateHelper().put(AutoCompletePropertyKeys.listItemRequired, listItemRequired);
	}

	public Integer getMaxItems() {
		return (Integer) getStateHelper().eval(AutoCompletePropertyKeys.maxItems, null);
	}

	public void setMaxItems(Integer maxItems) {
		getStateHelper().put(AutoCompletePropertyKeys.maxItems, maxItems);
	}

	public Integer getMinChars() {
		return (Integer) getStateHelper().eval(AutoCompletePropertyKeys.minChars, null);
	}

	public void setMinChars(Integer minChars) {
		getStateHelper().put(AutoCompletePropertyKeys.minChars, minChars);
	}

	public javax.el.MethodExpression getServerCustomFilter() {
		return (javax.el.MethodExpression) getStateHelper().eval(AutoCompletePropertyKeys.serverCustomFilter, null);
	}

	public void setServerCustomFilter(javax.el.MethodExpression serverCustomFilter) {
		getStateHelper().put(AutoCompletePropertyKeys.serverCustomFilter, serverCustomFilter);
	}

	public String getServerFilterType() {
		return (String) getStateHelper().eval(AutoCompletePropertyKeys.serverFilterType, null);
	}

	public void setServerFilterType(String serverFilterType) {
		getStateHelper().put(AutoCompletePropertyKeys.serverFilterType, serverFilterType);
	}

	public Boolean isTabSelect() {
		return (Boolean) getStateHelper().eval(AutoCompletePropertyKeys.tabSelect, true);
	}

	public void setTabSelect(Boolean tabSelect) {
		getStateHelper().put(AutoCompletePropertyKeys.tabSelect, tabSelect);
	}

	public String getWidth() {
		return (String) getStateHelper().eval(AutoCompletePropertyKeys.width, null);
	}

	public void setWidth(String width) {
		getStateHelper().put(AutoCompletePropertyKeys.width, width);
	}
}
//J+
