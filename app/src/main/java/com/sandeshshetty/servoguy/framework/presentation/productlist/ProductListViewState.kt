package com.sandeshshetty.servoguy.framework.presentation.productlist

import androidx.constraintlayout.motion.utils.ViewState
import com.sandeshshetty.servoguy.business.domain.model.Product

/**
 * @author sandeshshetty
 * Created 9/24/22 at {TIME}
 */
data class ProductListViewState(
    val message: String? = null,
    val success: Boolean? = false,
    val productList: List<Product> ?= null,
): ViewState() {
}