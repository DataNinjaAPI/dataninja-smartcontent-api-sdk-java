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

import java.util.ArrayList;
import java.util.List;

public class Results {

    private String service_id;

    private String text;

    private String title;

    private List<Concept> concept_list = new ArrayList<Concept>();

    private List<Category> category_list = new ArrayList<Category>();

    private EntityList entity_list = new EntityList();

    public String getService_id() {
        return service_id;
    }

    public void setService_id(String service_id) {
        this.service_id = service_id;
    }

    public List<Concept> getConcept_list() {
        return concept_list;
    }

    public void setConcept_list(List<Concept> concept_list) {
        this.concept_list = concept_list;
    }

    public List<Category> getCategory_list() {
        return category_list;
    }

    public void setCategory_list(List<Category> category_list) {
        this.category_list = category_list;
    }

    public EntityList getEntity_list() {
        return entity_list;
    }

    public void setEntity_list(EntityList entity_list) {
        this.entity_list = entity_list;
    }

    @Override
    public String toString() {
        return "Results{" +
                "service_id='" + service_id + '\'' +
                ", concept_list=" + concept_list +
                ", category_list=" + category_list +
                ", entity_list=" + entity_list.toString() +
                '}';
    }
}
