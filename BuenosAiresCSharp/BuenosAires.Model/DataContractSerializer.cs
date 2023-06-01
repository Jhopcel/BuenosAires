using System;

namespace BuenosAires.Model
{
    internal class DataContractSerializer
    {
        private Type type;

        public DataContractSerializer(Type type)
        {
            this.type = type;
        }
    }
}