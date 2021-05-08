/*
 * #%L
 * PistonQueue
 * %%
 * Copyright (C) 2021 AlexProgrammerDE
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package net.pistonmaster.pistonqueue.bungee;

import lombok.Getter;
import net.pistonmaster.pistonqueue.bungee.utils.Pair;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public enum QueueType {
    REGULAR,
    PRIORITY,
    VETERAN;

    @Getter
    private final Map<UUID, String> queueMap = new LinkedHashMap<>();

    @Getter
    private final Map<Integer, Duration> durationToPosition = new LinkedHashMap<>();

    @Getter
    private final Map<UUID, List<Pair<Integer, Instant>>> positionCache = new HashMap<>();
}
