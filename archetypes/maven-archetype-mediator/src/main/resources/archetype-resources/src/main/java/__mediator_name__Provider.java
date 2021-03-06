/*
 * Copyright (c) 2016, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 * <p>
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package $package;

import org.wso2.ballerina.core.flow.Mediator;
import org.wso2.ballerina.core.flow.MediatorProvider;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Component;

/**
* Mediator Provider Implementation
*/
@Component(
        name = "${mediator_name}Provider",
        immediate = true,
        service = MediatorProvider.class
)
public class ${mediator_name}Provider implements MediatorProvider {

    @Activate
    protected void start(BundleContext bundleContext) {
    }

    @Override
    public String getName() {
        return "${mediator_name}";
    }

    @Override
    public Mediator getMediator() {
        return new ${mediator_name}();
    }

}
