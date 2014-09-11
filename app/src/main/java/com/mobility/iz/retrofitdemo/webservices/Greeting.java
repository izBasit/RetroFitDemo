
/*
 * Copyright 2014 Basit Parkar.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * @date 11/9/14 1:21 PM
 * @modified 11/9/14 7:50 AM
 */

package com.mobility.iz.retrofitdemo.webservices;

import java.util.List;

public class Greeting{
   	private String documentation_url;
   	private String message;

 	public String getDocumentation_url(){
		return this.documentation_url;
	}
	public void setDocumentation_url(String documentation_url){
		this.documentation_url = documentation_url;
	}
 	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}

    @Override
    public String toString() {
        return "Greeting{" +
                "documentation_url='" + documentation_url + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
