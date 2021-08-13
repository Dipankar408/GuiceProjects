package com.shape.request;

import com.google.inject.Inject;
import com.shape.services.Shapes;

public class RectangleRequest {
		@Inject
		Shapes sh;
//		@Inject
//		public RectangleRequest(Shapes sh) {
//			super();
//			this.sh = sh;
//		}
		
		public void makeRequest() {
			sh.area();
			sh.parameter();
		}
}
