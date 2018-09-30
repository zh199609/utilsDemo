/*
 * CMB Confidential
 *
 * Copyright (C) 2018 China Merchants Bank Co., Ltd. All rights reserved.
 *
 * No part of this file may be reproduced or transmitted in any form or by any
 * means, electronic, mechanical, photocopying, recording, or otherwise, without
 * prior written permission of China Merchants Bank Co., Ltd.
 */
package com.zl.enumdemo;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum CheckOutStatus {
	APPLY_FOR_CHEC_OUT("申请退宿"), CANCEL_CHECK_OUT("撤销退宿"), ALREADY_CHECK_OUT("已退宿");
	private String name;

	CheckOutStatus(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return this.toString();
	}
}
