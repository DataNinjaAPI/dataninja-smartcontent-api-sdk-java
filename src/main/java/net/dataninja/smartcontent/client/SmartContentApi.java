/*
 * Copyright 2015 DOCOMO Innovations, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE
 * USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * See the License for the specific language governing permissions and limitations under the License.
 */

package net.dataninja.smartcontent.client;

import retrofit.http.Body;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * This interface defines a Client API for a Smart Content API. The
 * interface is used to provide a contract for client/server
 * interactions.
 */

public interface SmartContentApi {

	// Make the API call work with Mashape and local endpoints
	// Optional query parameter: option=con,cat,ee,ke,ks

	// The path where we expect the Smart Content to live
	public static final String SMARTCONTENT_SVC_PATH = "/smartcontent";

	@POST("/smartcontent/tag")
	Results processSmartContent(@Query("option") String option, @Body Input input);
}
