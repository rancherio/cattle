package io.cattle.platform.allocator.constraint;

import io.cattle.platform.allocator.service.AllocationCandidate;

public class VolumeAccessModeSingleHostConstraint implements Constraint {
    String hostId;
    String volumeId;
    String volumeName;
    String hostName;
    boolean hard;

    public VolumeAccessModeSingleHostConstraint(String hostId, String volumeId, String volumeName, String hostName, boolean hard) {
        super();
        this.hostId = hostId;
        this.volumeId = volumeId;
        this.volumeName = volumeName;
        this.hostName = hostName;
        this.hard = hard;
    }

    @Override
    public String toString() {
        return String.format("Volume %s(id: %s) can only be used on host %s(id: %s)", volumeName, volumeId, hostName, hostId);
    }

    @Override
    public boolean matches(AllocationCandidate candidate) {
        return hostId.equals(candidate.getHost());
    }

    @Override
    public final boolean isHardConstraint() {
        return hard;
    }
}
