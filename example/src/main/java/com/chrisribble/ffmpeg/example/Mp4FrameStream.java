package com.chrisribble.ffmpeg.example;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.lang.foreign.Arena;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Mp4FrameStream implements Stream<BufferedImage> {
	private final Arena arena;
	private final Stream<BufferedImage> delegate;

	private Mp4FrameStream(final Builder builder) throws FileNotFoundException {
		arena = Arena.ofConfined();
		try {
			Spliterator<BufferedImage> splitr = Mp4FrameStreamSpliterator.builder()
					.mp4(builder.mp4)
					.modFrames(builder.modFrames)
					.palette(builder.palette)
					.build(arena);
			delegate = StreamSupport.stream(splitr, false);
		} catch (FileNotFoundException | RuntimeException e) {
			arena.close();
			throw e;
		}
	}

	@Override
	public void close() {
		try {
			delegate.close();
		} finally {
			arena.close();
		}
	}

	@Override
	public Stream<BufferedImage> onClose(final Runnable closeHandler) {
		return delegate.onClose(closeHandler);
	}

	@Override
	public Iterator<BufferedImage> iterator() {
		return delegate.iterator();
	}

	@Override
	public Spliterator<BufferedImage> spliterator() {
		return delegate.spliterator();
	}

	@Override
	public boolean isParallel() {
		return delegate.isParallel();
	}

	@Override
	public Stream<BufferedImage> sequential() {
		return delegate.sequential();
	}

	@Override
	public Stream<BufferedImage> parallel() {
		return delegate.parallel();
	}

	@Override
	public Stream<BufferedImage> unordered() {
		return delegate.unordered();
	}

	@Override
	public Stream<BufferedImage> filter(final Predicate<? super BufferedImage> predicate) {
		return delegate.filter(predicate);
	}

	@Override
	public <R> Stream<R> map(final Function<? super BufferedImage, ? extends R> mapper) {
		return delegate.map(mapper);
	}

	@Override
	public IntStream mapToInt(final ToIntFunction<? super BufferedImage> mapper) {
		return delegate.mapToInt(mapper);
	}

	@Override
	public LongStream mapToLong(final ToLongFunction<? super BufferedImage> mapper) {
		return delegate.mapToLong(mapper);
	}

	@Override
	public DoubleStream mapToDouble(final ToDoubleFunction<? super BufferedImage> mapper) {
		return delegate.mapToDouble(mapper);
	}

	@Override
	public <R> Stream<R> flatMap(final Function<? super BufferedImage, ? extends Stream<? extends R>> mapper) {
		return delegate.flatMap(mapper);
	}

	@Override
	public IntStream flatMapToInt(final Function<? super BufferedImage, ? extends IntStream> mapper) {
		return delegate.flatMapToInt(mapper);
	}

	@Override
	public LongStream flatMapToLong(final Function<? super BufferedImage, ? extends LongStream> mapper) {
		return delegate.flatMapToLong(mapper);
	}

	@Override
	public DoubleStream flatMapToDouble(final Function<? super BufferedImage, ? extends DoubleStream> mapper) {
		return delegate.flatMapToDouble(mapper);
	}

	@Override
	public <R> Stream<R> mapMulti(final BiConsumer<? super BufferedImage, ? super Consumer<R>> mapper) {
		return delegate.mapMulti(mapper);
	}

	@Override
	public IntStream mapMultiToInt(final BiConsumer<? super BufferedImage, ? super IntConsumer> mapper) {
		return delegate.mapMultiToInt(mapper);
	}

	@Override
	public LongStream mapMultiToLong(final BiConsumer<? super BufferedImage, ? super LongConsumer> mapper) {
		return delegate.mapMultiToLong(mapper);
	}

	@Override
	public DoubleStream mapMultiToDouble(final BiConsumer<? super BufferedImage, ? super DoubleConsumer> mapper) {
		return delegate.mapMultiToDouble(mapper);
	}

	@Override
	public Stream<BufferedImage> distinct() {
		return delegate.distinct();
	}

	@Override
	public Stream<BufferedImage> sorted() {
		return delegate.sorted();
	}

	@Override
	public Stream<BufferedImage> sorted(final Comparator<? super BufferedImage> comparator) {
		return delegate.sorted(comparator);
	}

	@Override
	public Stream<BufferedImage> peek(final Consumer<? super BufferedImage> action) {
		return delegate.peek(action);
	}

	@Override
	public Stream<BufferedImage> limit(final long maxSize) {
		return delegate.limit(maxSize);
	}

	@Override
	public Stream<BufferedImage> skip(final long n) {
		return delegate.skip(n);
	}

	@Override
	public Stream<BufferedImage> takeWhile(final Predicate<? super BufferedImage> predicate) {
		return delegate.takeWhile(predicate);
	}

	@Override
	public Stream<BufferedImage> dropWhile(final Predicate<? super BufferedImage> predicate) {
		return delegate.dropWhile(predicate);
	}

	@Override
	public void forEach(final Consumer<? super BufferedImage> action) {
		delegate.forEach(action);
	}

	@Override
	public void forEachOrdered(final Consumer<? super BufferedImage> action) {
		delegate.forEachOrdered(action);
	}

	@Override
	public Object[] toArray() {
		return delegate.toArray();
	}

	@Override
	public <A> A[] toArray(final IntFunction<A[]> generator) {
		return delegate.toArray(generator);
	}

	@Override
	public BufferedImage reduce(final BufferedImage identity, final BinaryOperator<BufferedImage> accumulator) {
		return delegate.reduce(identity, accumulator);
	}

	@Override
	public Optional<BufferedImage> reduce(final BinaryOperator<BufferedImage> accumulator) {
		return delegate.reduce(accumulator);
	}

	@Override
	public <U> U reduce(final U identity, final BiFunction<U, ? super BufferedImage, U> accumulator, final BinaryOperator<U> combiner) {
		return delegate.reduce(identity, accumulator, combiner);
	}

	@Override
	public <R> R collect(final Supplier<R> supplier, final BiConsumer<R, ? super BufferedImage> accumulator, final BiConsumer<R, R> combiner) {
		return delegate.collect(supplier, accumulator, combiner);
	}

	@Override
	public <R, A> R collect(final Collector<? super BufferedImage, A, R> collector) {
		return delegate.collect(collector);
	}

	@Override
	public List<BufferedImage> toList() {
		return delegate.toList();
	}

	@Override
	public Optional<BufferedImage> min(final Comparator<? super BufferedImage> comparator) {
		return delegate.min(comparator);
	}

	@Override
	public Optional<BufferedImage> max(final Comparator<? super BufferedImage> comparator) {
		return delegate.max(comparator);
	}

	@Override
	public long count() {
		return delegate.count();
	}

	@Override
	public boolean anyMatch(final Predicate<? super BufferedImage> predicate) {
		return delegate.anyMatch(predicate);
	}

	@Override
	public boolean allMatch(final Predicate<? super BufferedImage> predicate) {
		return delegate.allMatch(predicate);
	}

	@Override
	public boolean noneMatch(final Predicate<? super BufferedImage> predicate) {
		return delegate.noneMatch(predicate);
	}

	@Override
	public Optional<BufferedImage> findFirst() {
		return delegate.findFirst();
	}

	@Override
	public Optional<BufferedImage> findAny() {
		return delegate.findAny();
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private Path mp4;
		private Integer modFrames;
		private ColorPalette palette;

		private Builder() {}

		public Builder mp4(final Path mp4) {
			this.mp4 = mp4;
			return this;
		}

		public Builder modFrames(final Integer modFrames) {
			this.modFrames = modFrames;
			return this;
		}

		public Builder palette(final ColorPalette palette) {
			this.palette = palette;
			return this;
		}

		public Mp4FrameStream build() throws FileNotFoundException {
			if (mp4 == null) {
				throw new IllegalArgumentException("mp4 must be non-null");
			}
			if (palette == null) {
				throw new IllegalArgumentException("palette must be non-null");
			}
			return new Mp4FrameStream(this);
		}
	}

}
