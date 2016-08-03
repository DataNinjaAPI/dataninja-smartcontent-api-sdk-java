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

public class Entity {

    private int id;

    private String keyword;

    private double entity_score;

    private String sentiment;

    private double sentiment_score;

    private String locations;

    private String prime_category;

    private String entity_name;

    private int count;

    private List<String> categories = new ArrayList<String>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public double getSentiment_score() {
        return sentiment_score;
    }

    public void setSentiment_score(double sentiment_score) {
        this.sentiment_score = sentiment_score;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public double getEntity_score() {
        return entity_score;
    }

    public void setEntity_score(double entity_score) {
        this.entity_score = entity_score;
    }

    public String getPrime_category() {
        return prime_category;
    }

    public void setPrime_category(String prime_category) {
        this.prime_category = prime_category;
    }

    public String getEntity_name() {
        return entity_name;
    }

    public void setEntity_name(String entity_name) {
        this.entity_name = entity_name;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", keyword='" + keyword + '\'' +
                ", entity_score=" + entity_score +
                ", sentiment='" + sentiment + '\'' +
                ", sentiment_score=" + sentiment_score +
                ", locations='" + locations + '\'' +
                ", prime_category='" + prime_category + '\'' +
                ", entity_name='" + entity_name + '\'' +
                ", count=" + count +
                ", categories=" + categories +
                '}';
    }
}
