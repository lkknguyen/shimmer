/*
 * Copyright 2015 Open mHealth
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openmhealth.shimmer.common.configuration;

import org.openmhealth.shimmer.common.domain.DateTimeQueryReferenceFrame;
import org.openmhealth.shimmer.common.domain.DateTimeQueryTimeZoneRestriction;
import org.openmhealth.shimmer.common.domain.parameters.DateTimeRequestParameter;

import java.time.Duration;
import java.time.ZoneId;
import java.util.Optional;

import static org.openmhealth.shimmer.common.domain.DateTimeQueryReferenceFrame.TIME_ZONES;
import static org.openmhealth.shimmer.common.domain.DateTimeQueryTimeZoneRestriction.ANY_TIME_ZONE;


/**
 * @author Emerson Farrugia
 */
public class DefaultDateTimeQueryConfigurationProperties implements DateTimeQueryConfigurationProperties {

    private DateTimeQueryReferenceFrame referenceFrame = TIME_ZONES;
    private DateTimeQueryTimeZoneRestriction timeZoneRestriction = ANY_TIME_ZONE;
    private ZoneId fixedTimeZone;
    private Duration minimumDuration;
    private Duration maximumDuration;
    private DateTimeRequestParameter startDateTimeParameter;
    private DateTimeRequestParameter endDateTimeParameter;


    @Override
    public DateTimeQueryReferenceFrame getReferenceFrame() {
        return referenceFrame;
    }

    public void setReferenceFrame(DateTimeQueryReferenceFrame referenceFrame) {
        this.referenceFrame = referenceFrame;
    }

    @Override
    public Optional<DateTimeQueryTimeZoneRestriction> getTimeZoneRestriction() {
        return Optional.ofNullable(timeZoneRestriction);
    }

    public void setTimeZoneRestriction(DateTimeQueryTimeZoneRestriction timeZoneRestriction) {
        this.timeZoneRestriction = timeZoneRestriction;
    }

    @Override
    public Optional<ZoneId> getFixedTimeZone() {
        return Optional.ofNullable(fixedTimeZone);
    }

    public void setFixedTimeZone(ZoneId expectedTimeZone) {
        this.fixedTimeZone = expectedTimeZone;
    }

    @Override
    public Optional<Duration> getMinimumDuration() {
        return Optional.ofNullable(minimumDuration);
    }

    public void setMinimumDuration(Duration minimumDuration) {
        this.minimumDuration = minimumDuration;
    }

    @Override
    public Optional<Duration> getMaximumDuration() {
        return Optional.ofNullable(maximumDuration);
    }

    @Override
    public Optional<DateTimeRequestParameter> getStartDateTimeParameter() {
        return Optional.ofNullable(startDateTimeParameter);
    }

    @Override
    public Optional<DateTimeRequestParameter> getEndDateTimeParameter() {
        return Optional.ofNullable(endDateTimeParameter);
    }

    public void setMaximumDuration(Duration maximumDuration) {
        this.maximumDuration = maximumDuration;
    }

    public void setStartDateTimeParameter(
            DateTimeRequestParameter startDateTimeParameter) {
        this.startDateTimeParameter = startDateTimeParameter;
    }

    public void setEndDateTimeParameter(
            DateTimeRequestParameter endDateTimeParameter) {
        this.endDateTimeParameter = endDateTimeParameter;
    }
}
