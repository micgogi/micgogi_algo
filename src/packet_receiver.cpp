#include "packet_receiver.h"
#include <iostream>
//implement StartPacket(): this prepared the object to receive new packet parts.
void PacketReceiver::StartPacket()
{
    m_packet_size = 0;
    m_packet_data.clear();
}
//implement ReceivePart(): this receive packet part of packet as follows:
//1. this function takes an id which describes the part of packet.
//2  control sum is the incoming

bool PacketReceiver::ReceivePart(uint16_t id, size_t controlSum, const std::string& data) {

}

std::vector<std::string> PacketReceiver::GetCollectedPackets() const {
    std::cout << "this is my debug message \n";
    return {};
}

size_t PacketReceiver::GetNumOfFailedParts() const {

}