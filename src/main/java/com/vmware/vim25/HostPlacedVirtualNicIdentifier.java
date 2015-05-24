package com.vmware.vim25;

/**
 * Created by Michael Rice on Wed May 20 23:39:36 CDT 2015
 * <p/>
 * Copyright 2015 Michael Rice
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @since 6.0
 */

public class HostPlacedVirtualNicIdentifier extends DynamicData {
    public ManagedObjectReference vm;

    public String vnicKey;

    public int reservation;

    public ManagedObjectReference getVm() {
        return vm;
    }

    public void setVm(ManagedObjectReference vm) {
        this.vm = vm;
    }

    public String getVnicKey() {
        return vnicKey;
    }

    public void setVnicKey(String vnicKey) {
        this.vnicKey = vnicKey;
    }

    public int getReservation() {
        return reservation;
    }

    public void setReservation(int reservation) {
        this.reservation = reservation;
    }

}