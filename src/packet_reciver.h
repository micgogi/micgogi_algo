#ifndef PACKET_RECEIVER_H
#define PACKET_RECEIVER_H

#include <vector>
#include <string>

class PacketReceiver {
public:
    void StartPacket();

    bool ReceivePart(uint16_t id, size_t controlSum, const std::string& data);

    std::vector<std::string> GetCollectedPackets() const;

    size_t GetNumOfFailedParts() const;

private:

};

#endif // PACKET_RECEIVER_H
