//  Copyright 2021 Goldman Sachs
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
//

package org.finos.legend.depot.services.guice;

import com.google.inject.PrivateModule;
import org.finos.legend.depot.services.api.entities.EntitiesService;
import org.finos.legend.depot.services.api.entities.EntityClassifierService;
import org.finos.legend.depot.services.api.versionedEntities.VersionedEntitiesService;
import org.finos.legend.depot.services.entities.EntitiesServiceImpl;
import org.finos.legend.depot.services.entities.EntityClassifierServiceImpl;
import org.finos.legend.depot.services.versionedEntities.VersionedEntitiesServiceImpl;


public class EntitiesServicesModule extends PrivateModule
{
    @Override
    protected void configure()
    {

        bind(EntitiesService.class).to(EntitiesServiceImpl.class);
        bind(VersionedEntitiesService.class).to(VersionedEntitiesServiceImpl.class);
        bind(EntityClassifierService.class).to(EntityClassifierServiceImpl.class);

        expose(EntitiesService.class);
        expose(VersionedEntitiesService.class);
        expose(EntityClassifierService.class);
    }

}
