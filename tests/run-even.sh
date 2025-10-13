#!/bin/bash

echo "🧪 Running Sum of Even Numbers Tests..."

# Make sure we're in the right directory
cd "$(dirname "$0")/.."

# Run only SumOfEvenNumbers tests
echo "📋 Running Sum of Even Numbers tests..."
mvn -q test -Dtest=SumOfEvenNumbersTest

if [ $? -eq 0 ]; then
    echo "✅ All Sum of Even Numbers tests passed! Great job!"
else
    echo "❌ Some Sum of Even Numbers tests failed. Check your implementation."
    exit 1
fi
