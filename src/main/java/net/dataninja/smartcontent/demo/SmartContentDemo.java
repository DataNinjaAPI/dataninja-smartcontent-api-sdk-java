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

package net.dataninja.smartcontent.demo;

import net.dataninja.smartcontent.client.Input;
import net.dataninja.smartcontent.client.SmartContentApi;
import net.dataninja.smartcontent.client.SmartContentClient;

import java.io.Console;

/**
 * A simple command demo to show how to use the Smart Content Java APIs
 */
public class SmartContentDemo {

    /**
     * Run through the Smart Content APIs and show usage
     */
    public void process() {
        SmartContentApi client = new SmartContentClient().getClient();
        String input;

        Console cmdline = System.console();
        if (cmdline == null) {
            System.err.println("No console for command line demo.");
            System.exit(1);
        }

        // Find a Smart Data concept
        input = cmdline.readLine("Enter text to find concepts, categories or entities: ");

        System.out.println(findSmartContentDemo(client, input).toString());
    }

    // Service options can be con,cat,ee,ke,ks
    public Object findSmartContentDemo(SmartContentApi client, String data) {
        Input input = new Input();
        input.setMax_size(100);
        input.setText(data);
        return client.processSmartContent("con,cat,ee,ke,ks", input);
    }


    public static void main(String[] args) {
        SmartContentDemo demo = new SmartContentDemo();
        demo.process();
    }
}
